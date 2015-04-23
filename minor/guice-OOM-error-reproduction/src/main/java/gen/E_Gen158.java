
  package gen;
  public class E_Gen158 {
  		@com.google.inject.Inject
  		public E_Gen158(E_Gen159 e_gen159){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen159 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  