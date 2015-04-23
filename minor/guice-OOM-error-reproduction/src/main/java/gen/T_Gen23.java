
  package gen;
  public class T_Gen23 {
  		@com.google.inject.Inject
  		public T_Gen23(T_Gen24 t_gen24){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen24 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  