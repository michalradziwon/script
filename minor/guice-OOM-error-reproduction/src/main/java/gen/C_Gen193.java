
  package gen;
  public class C_Gen193 {
  		@com.google.inject.Inject
  		public C_Gen193(C_Gen194 c_gen194){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen194 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  