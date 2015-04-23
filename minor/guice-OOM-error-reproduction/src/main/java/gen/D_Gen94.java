
  package gen;
  public class D_Gen94 {
  		@com.google.inject.Inject
  		public D_Gen94(D_Gen95 d_gen95){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen95 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  