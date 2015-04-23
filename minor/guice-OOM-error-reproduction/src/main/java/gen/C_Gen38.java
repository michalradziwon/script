
  package gen;
  public class C_Gen38 {
  		@com.google.inject.Inject
  		public C_Gen38(C_Gen39 c_gen39){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen39 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  