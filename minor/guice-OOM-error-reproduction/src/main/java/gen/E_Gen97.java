
  package gen;
  public class E_Gen97 {
  		@com.google.inject.Inject
  		public E_Gen97(E_Gen98 e_gen98){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen98 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  