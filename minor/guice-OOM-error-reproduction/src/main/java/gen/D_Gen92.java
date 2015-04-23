
  package gen;
  public class D_Gen92 {
  		@com.google.inject.Inject
  		public D_Gen92(D_Gen93 d_gen93){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen93 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  