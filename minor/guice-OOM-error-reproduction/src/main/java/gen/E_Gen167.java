
  package gen;
  public class E_Gen167 {
  		@com.google.inject.Inject
  		public E_Gen167(E_Gen168 e_gen168){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen168 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  