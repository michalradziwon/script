
  package gen;
  public class A_Gen51 {
  		@com.google.inject.Inject
  		public A_Gen51(A_Gen52 a_gen52){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen52 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  