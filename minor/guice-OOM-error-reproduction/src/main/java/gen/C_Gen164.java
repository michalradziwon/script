
  package gen;
  public class C_Gen164 {
  		@com.google.inject.Inject
  		public C_Gen164(C_Gen165 c_gen165){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen165 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  