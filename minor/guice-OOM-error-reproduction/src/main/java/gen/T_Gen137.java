
  package gen;
  public class T_Gen137 {
  		@com.google.inject.Inject
  		public T_Gen137(T_Gen138 t_gen138){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen138 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  