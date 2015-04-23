
  package gen;
  public class E_Gen58 {
  		@com.google.inject.Inject
  		public E_Gen58(E_Gen59 e_gen59){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen59 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  