
  package gen;
  public class O_Gen22 {
  		@com.google.inject.Inject
  		public O_Gen22(O_Gen23 o_gen23){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen23 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  