
  package gen;
  public class T_Gen24 {
  		@com.google.inject.Inject
  		public T_Gen24(T_Gen25 t_gen25){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen25 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  