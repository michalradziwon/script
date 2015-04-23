
  package gen;
  public class E_Gen166 {
  		@com.google.inject.Inject
  		public E_Gen166(E_Gen167 e_gen167){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen167 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  