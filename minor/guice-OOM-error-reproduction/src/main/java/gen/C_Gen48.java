
  package gen;
  public class C_Gen48 {
  		@com.google.inject.Inject
  		public C_Gen48(C_Gen49 c_gen49){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen49 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  