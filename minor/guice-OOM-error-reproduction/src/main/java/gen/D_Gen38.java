
  package gen;
  public class D_Gen38 {
  		@com.google.inject.Inject
  		public D_Gen38(D_Gen39 d_gen39){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen39 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  