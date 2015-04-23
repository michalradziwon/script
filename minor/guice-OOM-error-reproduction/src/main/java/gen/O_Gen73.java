
  package gen;
  public class O_Gen73 {
  		@com.google.inject.Inject
  		public O_Gen73(O_Gen74 o_gen74){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen74 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  