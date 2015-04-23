
  package gen;
  public class T_Gen11 {
  		@com.google.inject.Inject
  		public T_Gen11(T_Gen12 t_gen12){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen12 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  