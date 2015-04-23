
  package gen;
  public class E_Gen117 {
  		@com.google.inject.Inject
  		public E_Gen117(E_Gen118 e_gen118){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen118 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  