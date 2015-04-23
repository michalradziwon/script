
  package gen;
  public class O_Gen135 {
  		@com.google.inject.Inject
  		public O_Gen135(O_Gen136 o_gen136){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen136 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  