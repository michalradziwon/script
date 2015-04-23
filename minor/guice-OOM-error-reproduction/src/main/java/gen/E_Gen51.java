
  package gen;
  public class E_Gen51 {
  		@com.google.inject.Inject
  		public E_Gen51(E_Gen52 e_gen52){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen52 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  