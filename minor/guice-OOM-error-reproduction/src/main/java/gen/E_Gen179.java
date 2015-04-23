
  package gen;
  public class E_Gen179 {
  		@com.google.inject.Inject
  		public E_Gen179(E_Gen180 e_gen180){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen180 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  