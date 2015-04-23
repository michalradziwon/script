
  package gen;
  public class C_Gen51 {
  		@com.google.inject.Inject
  		public C_Gen51(C_Gen52 c_gen52){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen52 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  