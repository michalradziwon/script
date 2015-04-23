
  package gen;
  public class E_Gen21 {
  		@com.google.inject.Inject
  		public E_Gen21(E_Gen22 e_gen22){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen22 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  