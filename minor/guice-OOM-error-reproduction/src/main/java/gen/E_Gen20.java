
  package gen;
  public class E_Gen20 {
  		@com.google.inject.Inject
  		public E_Gen20(E_Gen21 e_gen21){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen21 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  