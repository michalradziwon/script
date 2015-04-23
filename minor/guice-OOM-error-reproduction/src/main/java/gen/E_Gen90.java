
  package gen;
  public class E_Gen90 {
  		@com.google.inject.Inject
  		public E_Gen90(E_Gen91 e_gen91){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen91 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  