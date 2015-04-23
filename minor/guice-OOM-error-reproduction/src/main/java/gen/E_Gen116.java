
  package gen;
  public class E_Gen116 {
  		@com.google.inject.Inject
  		public E_Gen116(E_Gen117 e_gen117){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen117 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  