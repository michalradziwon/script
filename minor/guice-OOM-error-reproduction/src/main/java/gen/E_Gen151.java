
  package gen;
  public class E_Gen151 {
  		@com.google.inject.Inject
  		public E_Gen151(E_Gen152 e_gen152){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen152 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  