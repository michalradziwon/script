
  package gen;
  public class E_Gen43 {
  		@com.google.inject.Inject
  		public E_Gen43(E_Gen44 e_gen44){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen44 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  