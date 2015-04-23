
  package gen;
  public class C_Gen29 {
  		@com.google.inject.Inject
  		public C_Gen29(C_Gen30 c_gen30){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen30 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  