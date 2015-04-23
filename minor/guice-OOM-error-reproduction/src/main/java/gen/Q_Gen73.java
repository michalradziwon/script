
  package gen;
  public class Q_Gen73 {
  		@com.google.inject.Inject
  		public Q_Gen73(Q_Gen74 q_gen74){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen74 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  