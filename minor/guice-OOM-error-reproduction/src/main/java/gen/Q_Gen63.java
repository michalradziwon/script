
  package gen;
  public class Q_Gen63 {
  		@com.google.inject.Inject
  		public Q_Gen63(Q_Gen64 q_gen64){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen64 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  