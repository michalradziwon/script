
  package gen;
  public class C_Gen21 {
  		@com.google.inject.Inject
  		public C_Gen21(C_Gen22 c_gen22){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen22 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  