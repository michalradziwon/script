
  package gen;
  public class T_Gen158 {
  		@com.google.inject.Inject
  		public T_Gen158(T_Gen159 t_gen159){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen159 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  