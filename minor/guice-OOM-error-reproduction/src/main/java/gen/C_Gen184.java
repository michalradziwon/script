
  package gen;
  public class C_Gen184 {
  		@com.google.inject.Inject
  		public C_Gen184(C_Gen185 c_gen185){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen185 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  