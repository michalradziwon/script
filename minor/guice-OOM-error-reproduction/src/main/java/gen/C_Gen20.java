
  package gen;
  public class C_Gen20 {
  		@com.google.inject.Inject
  		public C_Gen20(C_Gen21 c_gen21){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen21 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  