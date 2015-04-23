
  package gen;
  public class M_Gen87 {
  		@com.google.inject.Inject
  		public M_Gen87(M_Gen88 m_gen88){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen88 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  