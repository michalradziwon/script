
  package gen;
  public class E_Gen153 {
  		@com.google.inject.Inject
  		public E_Gen153(E_Gen154 e_gen154){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen154 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  