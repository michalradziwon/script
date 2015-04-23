
  package gen;
  public class E_Gen98 {
  		@com.google.inject.Inject
  		public E_Gen98(E_Gen99 e_gen99){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen99 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  