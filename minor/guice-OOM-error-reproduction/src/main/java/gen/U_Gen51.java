
  package gen;
  public class U_Gen51 {
  		@com.google.inject.Inject
  		public U_Gen51(U_Gen52 u_gen52){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen52 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  