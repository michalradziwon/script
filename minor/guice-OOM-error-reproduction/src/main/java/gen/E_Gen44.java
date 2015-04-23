
  package gen;
  public class E_Gen44 {
  		@com.google.inject.Inject
  		public E_Gen44(E_Gen45 e_gen45){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen45 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  