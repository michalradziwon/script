
  package gen;
  public class O_Gen92 {
  		@com.google.inject.Inject
  		public O_Gen92(O_Gen93 o_gen93){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen93 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  