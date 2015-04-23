
  package gen;
  public class T_Gen20 {
  		@com.google.inject.Inject
  		public T_Gen20(T_Gen21 t_gen21){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen21 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  