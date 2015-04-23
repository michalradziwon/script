
  package gen;
  public class T_Gen87 {
  		@com.google.inject.Inject
  		public T_Gen87(T_Gen88 t_gen88){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen88 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  