
  package gen;
  public class E_Gen14 {
  		@com.google.inject.Inject
  		public E_Gen14(E_Gen15 e_gen15){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen15 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  