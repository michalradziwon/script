
  package gen;
  public class E_Gen25 {
  		@com.google.inject.Inject
  		public E_Gen25(E_Gen26 e_gen26){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen26 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  