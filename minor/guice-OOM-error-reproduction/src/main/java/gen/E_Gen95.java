
  package gen;
  public class E_Gen95 {
  		@com.google.inject.Inject
  		public E_Gen95(E_Gen96 e_gen96){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen96 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  