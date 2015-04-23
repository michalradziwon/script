
  package gen;
  public class E_Gen22 {
  		@com.google.inject.Inject
  		public E_Gen22(E_Gen23 e_gen23){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen23 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  