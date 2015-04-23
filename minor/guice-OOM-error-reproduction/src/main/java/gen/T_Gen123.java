
  package gen;
  public class T_Gen123 {
  		@com.google.inject.Inject
  		public T_Gen123(T_Gen124 t_gen124){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen124 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  