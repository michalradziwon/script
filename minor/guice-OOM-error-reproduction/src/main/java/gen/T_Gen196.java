
  package gen;
  public class T_Gen196 {
  		@com.google.inject.Inject
  		public T_Gen196(T_Gen197 t_gen197){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen197 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  