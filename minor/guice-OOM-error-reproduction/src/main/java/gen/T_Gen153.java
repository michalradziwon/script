
  package gen;
  public class T_Gen153 {
  		@com.google.inject.Inject
  		public T_Gen153(T_Gen154 t_gen154){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen154 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  