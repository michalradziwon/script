
  package gen;
  public class T_Gen149 {
  		@com.google.inject.Inject
  		public T_Gen149(T_Gen150 t_gen150){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen150 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  