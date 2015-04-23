
  package gen;
  public class T_Gen19 {
  		@com.google.inject.Inject
  		public T_Gen19(T_Gen20 t_gen20){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen20 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  