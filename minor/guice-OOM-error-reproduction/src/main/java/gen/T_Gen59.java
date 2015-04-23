
  package gen;
  public class T_Gen59 {
  		@com.google.inject.Inject
  		public T_Gen59(T_Gen60 t_gen60){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen60 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  